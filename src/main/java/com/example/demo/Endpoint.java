import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Workout>> getUserWorkouts(@PathVariable Long userId) {
        List<Workout> workouts = workoutService.getUserWorkouts(userId);
        return new ResponseEntity<>(workouts, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Workout> saveWorkout(@RequestBody Workout workout) {
        Workout savedWorkout = workoutService.saveWorkout(workout);
        return new ResponseEntity<>(savedWorkout, HttpStatus.CREATED);
    }
    // Other endpoints for updating, deleting, etc.
}
